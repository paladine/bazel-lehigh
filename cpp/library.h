#ifndef _LIBRARY_H
#define _LIBRARY_H

namespace example {
  class Library {
  public:
    Library();
    virtual ~Library();

    virtual int getValue() = 0;
  };
}

#endif
