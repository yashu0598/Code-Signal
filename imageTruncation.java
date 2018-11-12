int[][] imageTruncation(int[][] image, int threshold) {

  for (int i = 0; i < image.length; i++) {
    for (int j = 0; j < image[0].length; j++) {
      if (image[i][j] > threshold) {
         image[i][j]=threshold ;
      }
    }
  }
  return image;
}
