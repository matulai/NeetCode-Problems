class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // para evitar overflow en arrays, equivalente a: (left + right) / 2
            int mid = left + (right - left) / 2; 

            if (nums[mid] == target) {
                return mid; // encontrado
            }
            if (nums[mid] < target) {
                left = mid + 1; // buscar en la mitad derecha sin contar el actual
            } else {
                right = mid - 1; // buscar en la mitad izquierda sin contar el actual
            }
        }
        return -1; // no encontrado
    }
}

/*                L                                         R
 *  |             |       |             |     |             |       |
 *                      (R-L)/2         +L   R-L
 * 
 */