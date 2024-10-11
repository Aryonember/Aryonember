#include <stdio.h>


int TwoZin(int num)
{
	if (num > 0)
	{
		TwoZin((num - num % 2) / 2);
		printf("%d", num % 2);
	}

	return;
}

int main(void)
{
	int num;
	printf("양의 정수 입력 : ");
	scanf_s("%d", &num);
	TwoZin(num);

	return 0;
}