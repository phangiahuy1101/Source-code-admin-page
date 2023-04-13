package com.training.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/accounts")
    public String showAccount(Model model) {
        model.addAttribute("container", "components/container/accounts");
        return "index";
    }

    @GetMapping("/add_product")
    public String addProduct(Model model) {
        model.addAttribute("container", "components/container/add_product");
        return "index";
    }

    @GetMapping("/create_user_form")
    public String createUserProduct(Model model) {
        model.addAttribute("container", "components/container/create_user_form");
        return "index";
    }

    @GetMapping("/edit_product")
    public String editProduct(Model model) {
        model.addAttribute("container", "components/container/edit_product");
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("container", "components/container/main");
        return "index";
    }

    @GetMapping("/login_file")
    public String loginFile(Model model) {
        model.addAttribute("container", "components/container/login_file");
        return "index";
    }
    @GetMapping("/notification-manage")
    public String notificationManage(Model model) {
        model.addAttribute("container", "components/container/notification-manage");
        return "index";
    }
    @GetMapping("/order_list_manage")
    public String orderListManage(Model model) {
        model.addAttribute("container", "components/container/order_list_manage");
        return "index";
    }
    @GetMapping("/post_manage")
    public String postManage(Model model) {
        model.addAttribute("container", "components/container/post_manage");
        return "index";
    }
    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("container", "components/container/product");
        return "index";
    }
    @GetMapping("/update_user_form")
    public String updateUserForm(Model model) {
        model.addAttribute("container", "components/container/update_user_form");
        return "index";
    }


}