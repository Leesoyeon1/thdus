package generics;

public class Product<T, M> {
	private T kind;
	private M model;

	public void setkind(T kind) {
		this.kind = kind;

	}

	public void setModel(M model) {
		this.model = model;
	}

	public M getModel() {
		return model;
	}

	public T getKind() {
		return kind;
	}
}
