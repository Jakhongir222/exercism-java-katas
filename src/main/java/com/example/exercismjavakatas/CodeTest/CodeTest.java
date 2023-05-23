package com.example.exercismjavakatas.CodeTest;

public class CodeTest {

    /*
    A company is performing an analysis on the computers at its main office.
The computers are spaced along a single row. For each group of contiguous of a certain length, that is ,for each segment determine the minimum amount of disk space available on a computer.
Return maximum of these values as your answer

 Example:
 n= 4, the number of computers space=[8,2,4,6]
 x=2, the segment length.

The free disc space of computers in each of segments is [8,2],[2,4],[4,6].

The minima of the three segments are [2,2,4] maximum of these is 4.

Function description:

 Complete the function segment in  above,

 Segment has the following parameters:
 int x: the segment lengths to analyze int space[n]: available hard disk space on each computers

returns:
 int: the maximum of the minimal values of available hard disk space found while analyzing the computers and segments of lengths x
     */




    /*
     * Complete the 'segment' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER_ARRAY space


    int segment(int x, int space_count, int* space) {
        int max_min_space = INT_MIN;
        int min_space = INT_MAX;
        for (int i = 0; i < x; i++) {
            if (space[i] < min_space) {
                min_space = space[i];
            }
        }
        if (min_space > max_min_space) {
            max_min_space = min_space;
        }
        for (int i = x; i < space_count; i++) {
            if (space[i - x] == min_space) {
                min_space = INT_MAX;
                for (int j = i - x + 1; j <= i; j++) {
                    if (space[j] < min_space) {
                        min_space = space[j];
                    }
                }
            }
            if (space[i] < min_space) {
                min_space = space[i];
            }
            if (min_space > max_min_space) {
                max_min_space = min_space;
            }
        }

        return max_min_space;
    }

    int main()
    {
        FILE* fptr = fopen(getenv("OUTPUT_PATH"), "w");

        int x = parse_int(ltrim(rtrim(readline())));

        int space_count = parse_int(ltrim(rtrim(readline())));

        int* space = malloc(space_count * sizeof(int));

        for (int i = 0; i < space_count; i++) {
            int space_item = parse_int(ltrim(rtrim(readline())));

        *(space + i) = space_item;
        }

        int result = segment(x, space_count, space);

        fprintf(fptr, "%d\n", result);

        fclose(fptr);

        return 0;
    }

    char* readline() {
        size_t alloc_length = 1024;
        size_t data_length = 0;

        char* data = malloc(alloc_length);

        while (true) {
            char* cursor = data + data_length;
            char* line = fgets(cursor, alloc_length - data_length, stdin);

            if (!line) {
                break;
            }

            data_length += strlen(cursor);

            if (data_length < alloc_length - 1 || data[data_length - 1] == '\n') {
                break;
            }

            alloc_length <<= 1;

            data = realloc(data, alloc_length);

            if (!data) {
                data = '\0';

                break;
            }
        }

        if (data[data_length - 1] == '\n') {
            data[data_length - 1] = '\0';

            data = realloc(data, data_length);

            if (!data) {
                data = '\0';
            }
        } else {
            data = realloc(data, data_length + 1);

            if (!data) {
                data = '\0';
            } else {
                data[data_length] = '\0';
            }
        }

        return data;
    }

    char* ltrim(char* str) {
        if (!str) {
            return '\0';
        }

        if (!*str) {
            return str;
        }

        while (*str != '\0' && isspace(*str)) {
            str++;
        }

        return str;
    }

    char* rtrim(char* str) {
        if (!str) {
            return '\0';
        }

        if (!*str) {
            return str;
        }

        char* end = str + strlen(str) - 1;

        while (end >= str && isspace(*end)) {
            end--;
        }

    *(end + 1) = '\0';

        return str;
    }

    int parse_int(char* str) {
        char* endptr;
        int value = strtol(str, &endptr, 10);

        if (endptr == str || *endptr != '\0') {
            exit(EXIT_FAILURE);
        }

        return value;
    }
     */


}
