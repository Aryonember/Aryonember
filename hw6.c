#include <stdio.h>

int isEven(num)
{
	if (num % 2 == 0)
		return 1;
	else
		return 0;
}

int main(void)
{
	int numbers[5];
	printf("Please input five integers : ");
	scanf_s("%d %d %d %d %d", &numbers[0], &numbers[1], &numbers[2], &numbers[3], &numbers[4]);

	printf("\nOdd numbers : ");
		for (int i = 0; i < 5; i++)
		{
			if (isEven(numbers[i]) == 0)
				printf("%d ", numbers[i]);
		}
	printf("\nEven numbers : ");

	for (int i = 0; i < 5; i++)
	{
		if (isEven(numbers[i]) == 1)
			printf("%d ", numbers[i]);
	}
	return 0;
}