#include<stdio.h>
#include<stdlib.h>

char* sayHello(char *name) {
    char* hello = (char*) malloc((8 + sizeof(name))*sizeof(char));
    sprintf(hello, "Hello %s", name);
    return hello;
}
