
/**
 * A generic Matrix class.
 */
public class Matrix<T> {
    private T[][] data;
    private static final int DEFAULT_INITIAL_SIZE = 10001;

    public Matrix(){
        data = (T[][]) new Object[DEFAULT_INITIAL_SIZE][DEFAULT_INITIAL_SIZE];
    }

    /**
     * Instatiate a M x N Matrix
     * @param rows amount of rows
     * @param columns amount of columns
     */
    public Matrix(final int rows, final int columns){
        data = (T[][]) new Object[rows][columns];
    }

    /**
     * Write/update data at cell [m][n]
     * @param row
     * @param column
     * @param data
     */
    public void insert(final int row, final int column, T data){
        this.data[row][column] =  data;
    }

    /**
     * Return data at cell [m][n]
     * @param row
     * @param column
     * @return data of type T
     */
    public T get(final int row, final int column){
        return data[row][column];
    }

    /**
     * Check if cell [m][n] is empty
     * @param row
     * @param column
     * @return true if no data, else false
     */
    public boolean empty(final int row, final int column){
        return data[row][column] == null;
    }

    /**
     * Get the number of rows
     * @return amount of rows
     */
    public double getRows(){
        return data.length;
    }

    /**
     * Get the number of columns
     * @return amount of columns
     */
    public double getColumns(){
        return data[0].length;
    }

}
