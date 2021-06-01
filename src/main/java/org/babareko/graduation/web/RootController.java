package org.babareko.graduation.web;



public class RootController {

  /*  @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/")
    public String root() {
        return "redirect:restaurants";
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
       // model.addAttribute("users", userService.getAll());
        return "users";
    }

    @PostMapping("/users")
    public String setUser(HttpServletRequest request) {
        int userId = Integer.parseInt(request.getParameter("userId"));
        SecurityUtil.setAuthUserId(userId);
        return "redirect:restaurants";
    }

    @GetMapping("/restaurants")
    public String getRestaurants(Model model) {
        model.addAttribute("restaurants",
                RestaurantUtil.getTos(restaurantService.getAll(SecurityUtil.authUserId())));
        return "restaurants";
    }*/
}
