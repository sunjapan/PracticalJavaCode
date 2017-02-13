class Matrix2D
{
  private int[][] matrix;
  private boolean performAdd;
  private boolean performMultiply;
  private Matrix2D mat;
  private boolean actionPending;
  private int width;
  private int height;

  public Matrix2D(int sizex, int sizey, int initialValue)
  {
    width = sizex;
    height = sizey;
    matrix = new int[sizex][sizey];
    for (int i=0; i<sizex; i++)
      for (int j=0; j<sizey; j++)
        matrix[i][j] = initialValue;
  }
  public void addMatrix(Matrix2D other)
  {
    if (actionPending)
      performAction();
    performAdd = true;
    performMultiply = false;
    mat = other;
    actionPending = true;
  }
  public void multiplyMatrix(Matrix2D other)
  {
    if (actionPending)
      performAction();
    performMultiply = true;
    performAdd = false;
    mat = other;
    actionPending = true;
  }
  public int elementAt(int row, int col)
  {
    int value;
    if (performAdd)
      value = (mat.matrix[row][col]) + (this.matrix[row][col]);
    else
      value = (mat.matrix[row][col]) * (this.matrix[row][col]);

    actionPending = false;
    return value;
  }
  private void performAction()
  {
    if (performAdd)
    {
      for (int i=0; i<width; i++)
        for (int j=0; j<height; j++)
          matrix[i][j] += mat.matrix[i][j];
    }
    else if (performMultiply)
    {
      for (int i=0; i<width; i++)
        for (int j=0; j<height; j++)
          matrix[i][j] *= mat.matrix[i][j];
    }
  }
  //...
}

class test
{
  public static void main(String args[])
  {
    Matrix2D matrix1 = new Matrix2D(9,7,4);
    Matrix2D matrix2 = new Matrix2D(9,7,5);
    matrix1.multiplyMatrix(matrix2);
    matrix1.addMatrix(matrix2);
    System.out.println(matrix1.elementAt(2, 3));
    System.out.println(matrix1.elementAt(4, 1));
  }
}
