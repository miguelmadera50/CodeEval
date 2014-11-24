#include<stdio.h>
#include<ctype.h>

/* 
Adds 32 to the character value and prints as a char
Assumption is made that all characters are ASCII
Alternatively, tolower() from CTYPE can be used
*/

int main(int argc, const char * argv[]) {
    FILE *file = fopen(argv[1], "r");
    char line[1024];
    while (fgets(line, 1024, file)) {

		int i = 0;
		while (line[i])
		{		
			if(line[i] >= 'A' && line[i] <= 'Z')
				printf("%c", (toascii(line[i]) + 32));
			else printf("%c", line[i]);
			i++;
		}
		printf("\n");
    }
    return 0;
} 