#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node* prev;
    struct node* next;
};

struct node* head = NULL;
struct node* tail = NULL;
 int  idx = 0;
struct node* createNode(){   // Kutta function for kutti 
   idx ++;
    int item;
    struct node* ptr = (struct node*)malloc(sizeof(struct node));
    printf("Enter data: ");
    scanf("%d", &item);
    ptr->data = item;
    ptr->next = NULL;
    ptr->prev = NULL;
    return ptr;
}

void insertBeg() {
    struct node* ptr =createNode();
    if (head == NULL) {
        head = ptr;
        tail = ptr;
        return;
    }

    head->prev = ptr;
    ptr->next = head;
    head = ptr;
}

void insertEnd() {
    struct node* ptr = createNode();

    if (head == NULL) {
        head = ptr;
        tail = ptr;
        return;
    }
    tail->next = ptr;
    ptr->prev = tail;
    tail = ptr;
}
void insertPos() {
    int pos;
    printf("Enter the Index at which you want to insert: ");
    scanf("%d", &pos);
    
    if (pos <= 0 || pos > idx + 1) {
        printf("Enter a valid location.\n");
        return;
    }

    if (pos == 1) {
        insertBeg();
        return;
    }

    if (pos == idx + 1) {
        insertEnd();
        return;
    }

    struct node* ptr = createNode();
    struct node* current = head;
    
    for (int i = 1; i < pos - 1; i++) {
        current = current->next;
    }

    ptr->prev = current;
    ptr->next = current->next;
    current->next->prev = ptr;
    current->next = ptr;
   
}


void display() {
    struct node* temp = head;

    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL");
}
void displayrev(){
     struct node* temp = tail;

    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->prev;
    }
    printf("NULL");
}
void dltFirst(){
    if(head == NULL)
    {
    printf("...LinkedList is Empty...");
    return ;
    }
    idx--;
    struct node * tem = head ;
    int del_item= tem->data;
    if (head->next == NULL)
    {
    printf(" Your delted item is %d \n",del_item);
     free(tem);
     head = NULL;
     return;
    }
  printf(" Your delted item is %d \n",del_item);
  head = head->next;
  head->prev= NULL;
  free(tem);

}
void dltLast(){
    if(head == NULL)
    {
    printf("...LinkedList is Empty...");
    return ;
    }
    idx--;
    struct node * tem = tail ;
    int del_item= tem->data;
    if (head->next == NULL && head == tail) 
    {
    printf(" Your delted item is %d \n",del_item);
     free(tem);
     head = tail= NULL;
     return;
    }
  printf(" Your delted item is %d \n",del_item);
  tail =tail->prev;
  tail->next= NULL;
  free(tem);

}
void dltpos(){
    if(head == NULL)
    {
    printf("...LinkedList is Empty...");
    return ;
    }
    int pos;
    printf("Enter the Index which you want to remove \n");
    scanf("%d",&pos);
    if (pos<=0 || pos > idx)
    {
        printf("Enter a valid location..\n");
        return;
    }
    if(pos == 1){
        dltFirst();
        return;
    }
    if (pos == idx)
    {
        dltLast();
        return;
    }
    idx --;
    struct node * tem = head;
    while (pos > 1)
    {

       tem = tem->next;
       pos--;
    }
    printf(" Your delted item is %d \n",tem->data);

    tem->prev->next = tem->next;
    tem->next->prev =tem->prev;
    free(tem);
}

int main() {
    int choice;

    while (1) {
        printf("\n1. Insert at the beginning, 2. Insert at the end, 3. Display, 4.Delete First , 5. exit\n");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                insertBeg();
                break;
            case 2:
                insertEnd();
                break;
            case 3:
                display();
                break;
            case 4:
               dltFirst();
                break;
            case 5:
                dltLast();
                break;
            case 6:
                dltpos();
                break;
            case 7:
                insertPos();
                break;
            case 8:
              displayrev();
                break;
            case 9:
                exit(0);
                break;
            default:
                printf("Enter a valid choice.\n");
        }
    }

    return 0;
}
