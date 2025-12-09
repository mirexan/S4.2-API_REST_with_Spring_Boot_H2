package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.model.FruitDTO;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService{
private final FruitRepository fruitRepository;

public FruitServiceImpl(FruitRepository fruitRepository){
	this.fruitRepository = fruitRepository;
}

	@Override
	public FruitDTO addFruit(FruitDTO newFruitDTO) {

		return null;
	}
	public FruitDTO getFruitById(long id) {
	return null;
	}
	public List<FruitDTO> getAllFruits() {
	return null;
	}
	public FruitDTO updateFruitById(long id, FruitDTO newFruitDTO) {
	return null;
	}
	public void deleteFruitById(long id){
	}
}
