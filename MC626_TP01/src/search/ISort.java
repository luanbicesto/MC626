package search;

public interface ISort {
	// entra um array de inteiros (ordenado ou desordenado)
	// retorna um array de inteiros ordenado
	// ex.: 
	// entrada [0, 9, 8, 1, 2, 4, 3]
	// saída   [0, 1, 2, 3, 4, 8, 9]
	// o tamanho mínimo do array deve ser 1 (inclusive)
	// o tamanho máximo do array deve ser 65536 (inclusive)
	int[] sort(int[] a);
}