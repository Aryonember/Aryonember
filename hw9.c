#include <stdio.h>

int convCase(int ch)
{
	const int diff = 'a' - 'A';
	if (ch >= 'A' && ch <= 'Z')
		return ch + diff;
	else if (ch >= 'a' && ch <= 'z')
		return ch - diff;
	else
		return ch;
}

int main(void)
{
	char mun[100];
	printf("문자열 입력 : ");
	fgets(mun, sizeof(mun), stdin);
	int ch;
	int i = 0;

	while (mun[i] != '\0')
	{
		ch = mun[i];
		
		mun[i] = convCase(ch);
		i++;
	}
	puts(mun);
	return 0;
}