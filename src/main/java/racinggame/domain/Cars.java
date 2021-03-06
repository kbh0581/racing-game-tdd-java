package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

import racinggame.util.ValidationStatus;
import racinggame.util.ValidationUtils;

public class Cars {
	List<Car> carList;
	private static final String REGEX_TOKEN = ",";

	public Cars(String carNames) {
		validation(carNames);
		carList = mapCarList(carNames);
	}

	private List<Car> mapCarList(String carNames) {
		List<Car> carList = new ArrayList<>();
		for (String carName : carNames.split(REGEX_TOKEN)) {
			carList.add(new Car(carName));
		}
		return carList;
	}

	public Car getCar(int index) {
		return carList.get(index);
	}

	public int size() {
		return this.carList.size();
	}


	private void validation(String carNames) {
		ValidationStatus status = ValidationUtils.nameValid(carNames);
		if (!ValidationStatus.OK.equals(status)) {
			throw new IllegalArgumentException(status.getMessage());
		}
	}

	public List<Car> positionMaxCarList() {
		List<Car> list = new ArrayList<>();
		list.add(carList.get(0));
		for (int i = 1; i < size(); i++) {
			Car source = list.get(0);
			Car currentCar = carList.get(i);
			CarPositionCompareStatus status = currentCar.compete(source);
			maxCarCollectList(status, currentCar, list);
		}
		return list;
	}

	private void maxCarCollectList(CarPositionCompareStatus status, Car car, List<Car> collectList) {
		if (status.isBig()) {
			collectList.clear();
		}
		if (!status.isSmall()) {
			collectList.add(car);
		}
	}
}
