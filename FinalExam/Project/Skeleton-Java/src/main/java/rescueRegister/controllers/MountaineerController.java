package rescueRegister.controllers;

import org.springframework.ui.Model;
import rescueRegister.bindingModels.MountaineerBindingModel;
import rescueRegister.entities.Mountaineer;
import rescueRegister.repositories.MountaineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MountaineerController {
    private final MountaineerRepository mountaineerRepository;

    @Autowired
    public MountaineerController(MountaineerRepository mountaineerRepository) {
        this.mountaineerRepository = mountaineerRepository;
    }

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        List<Mountaineer> mountaineers = this.mountaineerRepository.findAll();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "mountaineer/index");
        modelAndView.addObject("mountaineers", mountaineers);

        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "mountaineer/create");

        return modelAndView;
    }

    @PostMapping("/create")
    public String create(Mountaineer mountaineer) {
        this.mountaineerRepository.saveAndFlush(mountaineer);

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        Mountaineer mountaineer = this.mountaineerRepository.getOne(id);

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "mountaineer/edit");
        modelAndView.addObject("mountaineer", mountaineer);

        return modelAndView;
    }

    @PostMapping("edit/{id}")
    public String edit(@PathVariable(value = "id") Integer id, MountaineerBindingModel mountaineerBindingModel) {
        Mountaineer mountaineer = this.mountaineerRepository.getOne(id);

        mountaineer.setAge(mountaineerBindingModel.getAge());
        mountaineer.setGender(mountaineerBindingModel.getGender());
        mountaineer.setName(mountaineerBindingModel.getName());
        mountaineer.setLastSeenDate(mountaineerBindingModel.getLastSeenDate());

        this.mountaineerRepository.saveAndFlush(mountaineer);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView remove(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        Mountaineer mountaineer = this.mountaineerRepository.getOne(id);

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "mountaineer/remove");
        modelAndView.addObject("mountaineer", mountaineer);

        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public String remove(Mountaineer mountaineer) {
        this.mountaineerRepository.delete(mountaineer);

        return "redirect:/";
    }
}
