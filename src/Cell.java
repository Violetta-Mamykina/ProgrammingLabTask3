import javafx.scene.control.Button;

public class Cell extends Button {

    private static Battleship battleship = null;

    public static void setBattleship(Battleship battleship) {
        Cell.battleship = battleship;
    }

    private void setCellType(int cellType) {
        switch (cellType) {
            case 0:
                this.getStyleClass().add("empty");
                this.setId("empty");
                break;
            case 1:
                this.getStyleClass().add("user_ship");
                this.setId("user_ship");
                //this.setDisable(false);
                break;
            case 2:
                this.getStyleClass().add("injured_ship");
                this.setId("injured_ship");
                break;
            case 3:
                this.getStyleClass().add("miss");
                this.setId("miss");
                break;
            case 4:
                this.getStyleClass().add("hidden_ship");
                this.setId("hidden_ship");
                break;
        }
    }


    public Cell(int x, int y, int cellType, int size) {
        this.setMinSize(size, size);
        this.setOnMouseClicked(event -> battleship.handlerHint(this));
        setCellType(cellType);
    }

    public Cell (int x, int y, int cellType) {
        this(x, y, cellType, 60);
    }
}
