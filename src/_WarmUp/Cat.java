package _WarmUp;

public class Cat {
	private String name;

	Cat(String catName) {
		name = catName;
	}

	public boolean equals(Object o) {
		return (((Cat) o).name.equals(this.name));
	}

}
