@RestController
@RequestMapping(path = "/api/v1/Products")

public class Controllers {
    @GetMapping("")
    List<String> getAllProducts(){
        Product P1 = new Product("haha","haa");
        Product P2 = new Product("ahsd","ashdj");
        return List.of(
                P1.AddSum(),
                P2.AddSum()
        );
    }
}
