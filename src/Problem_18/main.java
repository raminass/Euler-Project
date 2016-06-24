package Problem_18;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.sun.media.jai.opimage.MaxCRIF;

public class main {

	public static void main(String[] args) {
		int[][] mat = new int[100][100];

		int i = 0;

		try (FileReader in = new FileReader("p067_triangle.txt"); 
				BufferedReader br = new BufferedReader(in);) {

			String line;
			while ((line = br.readLine()) != null) {

				String[] str = line.split(" ");

				for (int k = 0, j = 0; k < str.length; k++, j++) {

					mat[i][j] = Integer.parseInt(str[k]);

				}

				i++;

			}
			
			for (int t = mat.length -2; t>0 ; t--) {
				
				
				for (int j = 0; j < mat.length && mat[t][j]!=0; j++) {
					
					mat[t][j]+= Math.max(mat[t+1][j], mat[t+1][j+1]);
					
				}
				
				
			}
			
			

			for (i = 0; i < mat.length; i++) {

				for (int j = 0; j < mat.length; j++) {

					System.out.print(mat[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
