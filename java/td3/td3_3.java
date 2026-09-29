int max2(int a, int b){
    return (a>b) ? a:b;
}


int max3(int a, int b, int c){
    return ((a>b) ? a:b) > c ? ((a>b) ? a:b):c;
}



void main() {
    IO.println(max3(2, 34,4));
}
