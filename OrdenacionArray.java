public class OrdenacionArray {
    public static void main(String[] args) {
        int[] numeros = {1, 65, 23, 4};
        for(int i =0; i < numeros.length -1; i++){
            int indiceMin = i;
            for(int j = i + 1; j< numeros.length; j++){
                if (numeros[j]< numeros[indiceMin]) {
                    indiceMin = j;
                }
            }
            int temp = numeros[i];
            numeros[i]=numeros[indiceMin];
            numeros[indiceMin] = temp;
        }
        System.out.println("Array ordenado: ");
        for (int i = 0; i< numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }
    }
}
