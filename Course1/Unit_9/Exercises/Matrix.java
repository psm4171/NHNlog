package Exercises;

import java.io.*;

public class Matrix {

    private static double[][] matrix;

    public Matrix(int n, int m){
        this.matrix = new double[n][m];
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int rows, int columns, double val) {
        this.matrix[rows][columns] = val;
    }

    public void setAllMatrixNumber(double[][] matrix) {
        this.matrix = matrix;
    }

    public void save(String filename) throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){

            for(double[] rows : matrix) {
                for(double columns : rows) {
                    bw.write(columns + " ");
                }
                bw.write('\n');
            }
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static Matrix read(String filename) throws IOException, ExceptionWrongMatrixValues, ExceptionWrongMatrixDimension {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        line = br.readLine();
        int rows = 1;
        int columns =  line.split(" ").length;

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        while ((line = br.readLine()) != null){
            rows++;
        }


        if (rows != rowLength || columns != colLength) {
            throw new ExceptionWrongMatrixDimension("Matrix dimensions do not match");
        }

        Matrix matrix = new Matrix(rows, columns);

        while ((line = br.readLine()) != null){
            String [] numbers = line.split(" ");
            for(String num : numbers) {
                try {
                    double value = Double.parseDouble(num);
                    if(value != Double.parseDouble(num)){
                        throw new ExceptionWrongMatrixValues("ExceptionWrongMatrixValues error!");
                    }
                    matrix.setMatrix(rows, columns, value);
                    columns++;
                }catch(NumberFormatException e) {
                    throw new ExceptionWrongMatrixValues("ExceptionWrongMatrixValues error! : " + e.getMessage());
                }
//                catch (ExceptionWrongMatrixDimension e){
//                    throw new ExceptionWrongMatrixDimension("ExceptionWrongMatrixDimension error!" + e.getMessage());
//                }
            }
            rows++;
            columns = 0;
        }

        return matrix;
    }

    public Matrix sum(Matrix m) {
        int rowLength = this.matrix.length;
        int colLength = this.matrix[0].length;


        if(!(m.matrix.length == rowLength && m.matrix[0].length == colLength)){
            return null;
        }

        Matrix sumMatrix = new Matrix(rowLength, colLength);
        double [][] arrMatrix = m.getMatrix();

        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < colLength; col++){
                double val = arrMatrix[row][col] + this.matrix[row][col];
                sumMatrix.setMatrix(row, col, val);
            }
        }

        return sumMatrix;
    }

    public Matrix product(Matrix m){
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        if( !(m.matrix.length == rowLength && m.matrix[0].length == colLength)){
            return null;
        }

        Matrix mulMatrix = new Matrix(rowLength, colLength);
        double[][] arrMatrix = m.getMatrix();
        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < colLength; col++){
                double mul_val = arrMatrix[row][col] * this.matrix[row][col];
                mulMatrix.setMatrix(row, col, mul_val);
            }
        }
        return mulMatrix;
    }

    public static double[][] createMatrix(int rowLength, int colLength, int startNum ){
        double[][] num = new double[rowLength][colLength];

        for(int row = 0; row < rowLength; row++){
            for(int col = 0; col < colLength; col++){
                num[row][col] = startNum;
                startNum++;
            }
        }
        return num;
    }


    public void printMatrix(){
        for(int rows = 0; rows < matrix.length; rows++){
            for(int columns = 0; columns < matrix.length; columns++){
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) throws IOException {
        String fileName = "Exercises/Matrix.txt";
        int rowLength = 3;
        int columnLength = 3;

        Matrix matrix1 = new Matrix(rowLength, columnLength);
        Matrix matrix2 = new Matrix(rowLength, columnLength);

        matrix1.setAllMatrixNumber(createMatrix(rowLength, columnLength, 3));
        matrix2.setAllMatrixNumber(createMatrix(rowLength, columnLength, 5));

        matrix1.printMatrix();
        matrix2.printMatrix();

        Matrix matrixSum = matrix1.sum(matrix2);

        Matrix matrixProduct = matrix1.product(matrix2);

        matrixSum.printMatrix();
        matrixProduct.printMatrix();

        matrix1.save(fileName);
        matrix2.save(fileName);


    }

}
