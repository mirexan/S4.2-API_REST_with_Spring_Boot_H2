package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.services.FruitService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController {
	private final FruitService fruitService;

	public FruitController(FruitService newFruitService){
		this.fruitService = newFruitService;
	}
}
