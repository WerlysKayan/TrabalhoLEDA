package tad.fila;

public class MinhaFilaEncadeada implements FilaIF<Integer> {

	@Override
	public void enfileirar(Integer item) throws FilaCheiaException {
		enfileirar(item);
	}

	@Override
	public Integer desenfileirar() throws FilaVaziaException {
		return desenfileirar();
	}

	@Override
	public Integer verificarCauda() {
		return verificarCauda();
	}

	@Override
	public Integer verificarCabeca() {
		return verificarCabeca();
	}

	@Override
	public boolean isEmpty() {
		return isEmpty();
	}

	@Override
	public boolean isFull() {
		return isFull();
	}

}
