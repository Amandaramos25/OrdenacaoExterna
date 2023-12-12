public class OrdenacaoInterna {
    public void Quicksort(Double numeros[],int left, int right){

        int i = left, j = right;
        Double tmp;
        Double pivot = numeros[(left + right) / 2];

        while (i <= j) {
            while (numeros[i]<pivot){
                i++;
            }
                
            while (numeros[j]>pivot){
                j--;
            }
                
            if (i <= j) {
                tmp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = tmp;
                i++;
                j--;
            }
            };
            /* recursion */
            if (left < j)
            Quicksort(numeros, left, j);
            if (i < right)
            Quicksort(numeros, i, right);
            
            
    }
}
