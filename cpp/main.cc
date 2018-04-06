#include <iostream>
#include <memory>
#include "library.h"

class SubLibrary : public example::Library {
public:
  SubLibrary() : Library() {}
  virtual ~SubLibrary() {}

  virtual int getValue() { return 5; }
};

int main(int argc, char **argv) {
  std::unique_ptr<example::Library> lib(new SubLibrary());
  std::cout << "Hello World: " << lib->getValue() << std::endl;
  return 0;
}
