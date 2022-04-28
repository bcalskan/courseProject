package mayinTarlasi;


import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {
    //pojo class
    int rowNumber, colNumber, size = 4;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    MayinTarlasi(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;//kaca kac oldugunu belirlemek icin
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun basladi ! ");
        while (game) {
            print(board);
            System.out.println("satir: ");
            row = sc.nextInt();
            System.out.println("Sutun : ");
            col = sc.nextInt();
            //burdan sonraki iki if blogundan dolayi  exception veriyor.
            //hala hata var
            if (row < 0 || row >= rowNumber) {
                System.out.println("gecersiz koordinat girdiniz");
                continue;
            }
            if (col < 0 || col >= colNumber) {
                System.out.println("gecersiz koordinat girdiniz");
                continue;
            }
            if (map[row][col] != -1) {
                check(row, col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Kazandiniz");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over");
            }
        }
    }

    public void check(int r, int c) {
        if (board[r][c] == 0) {
            if ((c < colNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 3) && (map[r + 1][c] == -1)) {
                board[r + 1][c]++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }
    }

    //rastgele mayinlari yerlestirmek icin yeni bi rmethod aciyoruz
    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        System.out.println("Mayin Tarlasi oyununa Hosgeldiniz");
        System.out.println("Lutfen oyunun boyutlarini giriniz");
        //System.out.println("satir sayisi : ");
        row = sc.nextInt();
        //System.out.println("Sutun sayisi : ");
        column = sc.nextInt();
        MayinTarlasi mayin = new MayinTarlasi(row, column);
        mayin.run();
    }





}
