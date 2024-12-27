#include<stdio.h>

int main(){
  int i , j , k , mul,r1 , c1 , r2 , c2, opt;

  printf("Please enter the rows and column of first matrix: ");
  scanf("%d %d",&r1,&c1);
  printf("Now enter the rows and column of Second matrix: ");
  scanf("%d %d",&r2,&c2);
  int a[r1][c1], b[r2][c2] , c[r1][c2];
  printf("Enter the element of first matrix: ");
  for(i = 0; i<r1; i++){
    for(j = 0; j<c1; j++){
      scanf("%d",&a[i][j]);
    }
  }
  printf("Now enter the element of second matrix: ");
  for(i = 0; i<r2; i++){
    for(j = 0; j<c2; j++){
      scanf("%d",&b[i][j]);
    }
  }
  printf("Please select your operation:(1:- Multiply , 2:- Addition , 3:- Substrsction , 4:- Divide): ");
  scanf("%d",&opt);
  
  switch(opt){

    //Maltiplication of Matrix


    case 1: 
    if(c1 != r2){
      printf("Matrix Multiplication is not possible");
      exit(0);
    }
    for(i = 0; i<r1; i++){
    for(j = 0; j<c2; j++){
      mul = 0;
      for(k = 0; k<c1; k++){
        mul += a[i][k] * b[k][j];
      }
      c[i][j] = mul;
    }
  }

  for(i = 0; i<r1; i++){
    for(j= 0; j<c2; j++){
      printf("%d\t",c[i][j]);
    }
    printf("\n");
  }
  break;
 // Addition of Matrix


  case 2:
  if(r1!=r2 && c1!=c2){
    printf("Matrix Addition is not possible");
    exit(0);
  }
  for( i = 0; i<r1; i++){
      for( j = 0; j<c2; j++){
        c[i][j] = a[i][j] + b[i][j];
        
      }
    }

    for(i = 0; i<r1; i++){
      for(j =0; j<c2; j++){
        printf("%d ",c[i][j]);
      }
      printf("\n");
    }
    break;

  // Subtraction of Matrix
    case 3:
    if(r1!=r2 && c1!=c2){
    printf("Matrix Subtraction is not possible");
    exit(0);
  }
    for( i = 0; i<r1; i++){
      for( j = 0; j<c2; j++){
        c[i][j] = a[i][j] - b[i][j];
        
      }
    }

    for(i = 0; i<r1; i++){
      for(j =0; j<c2; j++){
        printf("%d ",c[i][j]);
      }
      printf("\n");
    }
   break;
    // Division of Matrix
    case 4:
    if(r1!=r2 && c1!=c2){
    printf("Matrix Division is not possible");
    exit(0);
  }

    for( i = 0; i<r1; i++){
      for( j = 0; j<c2; j++){
        c[i][j] = a[i][j] / b[i][j];
        
      }
    }

    for(i = 0; i<r1; i++){
      for(j =0; j<c2; j++){
        printf("%d ",c[i][j]);
      }
      printf("\n");
    }

    break;
    default : 
    printf("Invailed Input");
  }
   
}