package n1;

import java.util.Arrays;

public class MediaAritmetica implements CalcularMedia {
	@Override
    public double calc(double... notas) {
		return Arrays.stream(notas).average().orElse(0);
    }
}
