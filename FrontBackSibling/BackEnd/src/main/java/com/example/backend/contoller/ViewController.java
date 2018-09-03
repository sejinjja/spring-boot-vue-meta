package com.example.backend.contoller;


import com.example.backend.dao.MockStoreDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @RequestMapping(path = "{store}/index.html", method = RequestMethod.GET)
    public String test(@PathVariable("store") String store, ModelMap model) {
        MockStoreDao mockStoreDao = MockStoreDao.getInstance();

        model.addAttribute("storeInfo", mockStoreDao.getInfo(store));

        return "index.html";
    }
}
