package n1;

import java.util.stream.IntStream;

public class MediaPonderada implements CalcularMedia {
	@Override
    public double calc(double... notas) {
		if (notas.length % 2 != 0) {
            throw new IllegalArgumentException("Número ímpar de argumentos");
        }
        double soma = IntStream.range(0, notas.length / 2)
                .mapToDouble(i -> notas[2 * i] * notas[2 * i + 1]).sum();
        double somaPesos = IntStream.range(0, notas.length / 2)
                .mapToDouble(i -> notas[2 * i + 1]).sum();
        return soma / somaPesos;
    }
}
