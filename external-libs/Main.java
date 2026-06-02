import org.apache.commons.lang3.math.NumberUtils;

void main(String[] args) {
    if (NumberUtils.isCreatable(args[0])) {
        IO.println("%s is a number".formatted(args[0]));
    } else {
        IO.println("%s is not a number".formatted(args[0]));
    }
}
