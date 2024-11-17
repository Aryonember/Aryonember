#include <stdio.h>
#include <math.h>

void pyojun(double* num)
{
	double sum = 0;
	double* start = num;
	int i = 0;
	for (i = 0; i < 5; i++)
	{
		sum += num[i];
	}

	double diff = sum / 5.0;

	start = num;
	sum = 0;

	for (int i = 0; i < 5; i++)
	{
		sum += pow(((*start) - diff), 2);
		start++;
	}
	sum /= 5.0;
	double result = sqrt(sum);

	printf("Standard Deviation : %.3lf", result);

	return 0;

}

int main(void)
{
	double numbers[5];

	printf("Enter five real numbers : ");
	scanf_s("%lf %lf %lf %lf %lf", &numbers[0], &numbers[1], &numbers[2], &numbers[3], &numbers[4]);

	pyojun(numbers);

	return 0;
}