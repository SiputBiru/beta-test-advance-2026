#include <stddef.h>

typedef struct Node {
  int data;
  struct Node* next;
} Node;

typedef struct {
  int size;
  Node* head;
} List;

void initList(List* l) {
  // l->head = nullptr_t; // only works in C23
  l->head = NULL;
  l->size = 0;
}
