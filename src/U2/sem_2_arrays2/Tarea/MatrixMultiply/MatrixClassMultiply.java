import java.util.Scanner;

public class MatrixClassMultiply {
	protected int[][] MatrixGeneral;
	protected int rogue;
	protected int empire;

	public MatrixClassMultiply(int f, int c) {
		super();
		this.MatrixGeneral = new int[f][c];
		this.rogue = f;
		this.empire = c;

	}

	public int getRogue() {
		return rogue;
	}

	public int getEmpire() {
		return empire;
	}

	public void setMG(int rogue, int empire, int vl) {
		MatrixGeneral[rogue][empire] = vl;
	}

	public void setRogue(int rogue) {
		this.rogue = rogue;
	}

	public void setEmpire(int empire) {
		this.empire = empire;
	}

	public int getMG(int rogue, int empire) {
		return MatrixGeneral[rogue][empire];
	}

	public MatrixClassMultiply MultMatrix(MatrixClassMultiply SegundaM) {
		if (this.empire != SegundaM.rogue) {
			throw new Error("Las columnas de la primera matrix no coinciden con las filas de la segunda matrix");
		}
		MatrixClassMultiply rslt = new MatrixClassMultiply(this.rogue, SegundaM.empire);
		for (int i = 0; i < this.rogue; i++) {
			for (int j = 0; j < SegundaM.empire; j++) {
				int suma = 0;
				for (int k = 0; k < this.empire; k++) {
					suma += this.MatrixGeneral[i][k] * SegundaM.MatrixGeneral[k][j];
				}
				rslt.setMG(i, j, suma);
			}
		}
		return rslt;
	}

	public void Digita() {
		try (Scanner n = new Scanner(System.in)) {
			System.out.println("Ingresa los valores de la Matrix:");

			for (int i=0; i<rogue; i++) {
				for(int j=0; j<empire; j++) {
					System.out.print("Ingresa Posición [" + i + "]["+j+"]:");
					int pos = n.nextInt();
					setMG(i, j, pos);
				}
			}
		}
	}

	public void Consola() {
		System.out.println("---------- MULTIPLICACIÓN DE LA MATRIZ --------------");
		for (int i=0; i< rogue; i++) {
			for (int j=0; j<empire; j++) {
				System.out.print(MatrixGeneral[i][j] + " ");
			}
			System.out.println();

		}
	}

}	

