package sainuc11.example.DBConnection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PinDetailsController {
    @Autowired
    private PinDetailsRepository pinDetailsRepo;
       
    @GetMapping("/pinDetails")
    public List<PinDetails> listAll(Model model) {
        List<PinDetails> pinDetails = pinDetailsRepo.findAll();
        model.addAttribute("pinList", pinDetails);
           
        return pinDetails;
    }
    
    @GetMapping("/pinDetails/{id}")
    public Optional<PinDetails> findById(@PathVariable String id) {
        Optional<PinDetails> pinDetails = pinDetailsRepo.findById(id);
//        pinDetailsRepo.findByPinCode(id);
           
        return pinDetails;
    }
       
    @GetMapping("/pinDetailsByPin/{pinCode}")
    public List<PinDetails> findByPinCode(@PathVariable String pinCode) {
        List<PinDetails> pinDetails = pinDetailsRepo.findByPinCode(pinCode);
//        pinDetailsRepo.findByPinCode(id);
           
        return pinDetails;
    }
}