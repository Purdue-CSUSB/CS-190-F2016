#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main(int argc, char *argv[]) {
        printf("This program will run indefinitely \n");
        printf("Or just 50 iterations if you add the -h flag \n");
	char *flag = "-h";
        if (argc == 2) {
                if (strcmp(argv[0],flag) == 1 || strcmp(argv[1],flag) == 1) {
			printf("-h Supplied. Will only loop 50 times. \n");
			printf("Weenie. \n");
                        for (int i = 0; i < 50; i++) {
						time_t current;
						current = time(NULL);
						printf(ctime(&current));
						sleep(30);
					}
                }
				else {
					while (1 == 1) {
						time_t current;
						current = time(NULL);
						printf(ctime(&current));
						sleep(30);
					}
					
				}
        }
		else {
			while (1 == 1) {
				time_t current;
				current = time(NULL);
				printf(ctime(&current));
				sleep(30);
			}
		}
        return 1;
}

