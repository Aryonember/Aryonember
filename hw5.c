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
	printf("���� ���� �Է� : ");
	scanf_s("%d", &num);
	TwoZin(num);

	return 0;
}