package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.stereotype.Service;

@Service
public class FruitServiceImpl implements FruitService{
private final FruitRepository fruitRepository;

public FruitServiceImpl(FruitRepository fruitRepository){
	this.fruitRepository = fruitRepository;
}
}
