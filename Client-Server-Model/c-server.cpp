#include <iostream>
#include <thread>

bool is_ended = false;

void run() {
    while (!is_ended) {
        std::cout << "Info: Server loop is executed once." << std::endl;
    }
}

int main(int argc, char const *argv[])
{
    std::thread t(run);

    char input;
    scanf("%c", &input);
    is_ended = true;

    return 0;
}