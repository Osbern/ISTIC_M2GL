package addressbookonline.web;

import addressbookonline.domain.Address;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/addresses")
@org.springframework.stereotype.Controller
@RooWebScaffold(path = "addresses", formBackingObject = Address.class)
public class Controller {
}
