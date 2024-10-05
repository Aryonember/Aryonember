#include <stdio.h>

int main(void)
{
	int num;
	
	printf("Please enter a number : ");
	scanf_s("%d", &num);

	switch (num)
	{
	case 1:
		printf("It is not a prime number.");
		return 0;
	case 2:
		printf("It is a prime number.");
		return 0;
	default:
		for (int i = num - 1; i > 1; i--)
		{
			if (num % i == 0 )
			{
				printf("It is not a prime number.");
				return 0;
			}
		}
		printf("It is a prime number.");
		return 0;
	}

	return 0;
}