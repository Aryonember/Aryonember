#include <stdio.h>

int main(void)
{
	int i, k, m;

	for (i = 0; i < 5; i++)
	{
		k = 2 * i + 1;
		for (m = 0; m < (9 - k) / 2; m++)
			printf(" ");
		for (m = 0; m < k; m++)
			printf("*");
		for (m = 0; m < (9 - k) / 2; m++)
			printf(" ");

		printf("\n");
	}

	return 0;
}