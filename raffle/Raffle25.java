
void main(final String[] args) throws NumberFormatException, InterruptedException {
    if (args.length != 2) {
        IO.println("Usage: java Raffle25.java [row] [column]");
        System.exit(1);
    }
    final int maxRows = Integer.parseInt(args[0]);
    final int maxColumns = Integer.parseInt(args[1]);
    final Random wowRNG = new Random();

    // Life starts at 0, so why can't we count that way? (╯°□°）╯︵ ┻━┻
    final int pickedRow = wowRNG.nextInt(maxRows) + 1;
    IO.println("Row " + pickedRow);
    Thread.sleep(2000);

    final int pickedColumn = wowRNG.nextInt(maxColumns) + 1;
    IO.println("Winner at row %d and column %d \uD83C\uDF89".formatted(pickedRow, pickedColumn));
}
