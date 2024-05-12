#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;
int idx=0;

struct node *createNode()
{
    idx ++;
    int item;
    struct node *newNode = (struct node *)malloc(sizeof(struct node));
    printf("Enter data: ");
    scanf("%d", &item);
    newNode->data = item;
    newNode->next = NULL;
    return newNode;
}

void insertBeg()
{
    struct node *ptr = createNode();
    if (head == NULL)
    {
        head = ptr;
        head->next = head;
        return;
    }
    ptr->next = head->next;
    head->next = ptr;
}
void insertEnd()
{
    struct node *ptr = createNode();
    if (head == NULL)
    {
        head = ptr;
        head->next = head;
        return;
    }
   struct node *tem=head->next;
   while (tem!=head)
   {
    tem=tem->next;
   }
   ptr->next=head->next;
   tem->next= ptr;
   head =ptr;
}
void insertAny(){
    int pos;
    printf("Enter the position\n");
    scanf("%d",&pos);
    if (pos>idx+1||pos<=0)
    {
        printf("Enter a valid position\n");
        return;
    }
   
    if (pos==1)
    {
       insertBeg();
       return;
    }
    if (pos==idx+1)
    {
        insertEnd();
        return;
    }
     struct node *ptr = createNode();
    struct node *curr = head->next;
    struct node *prv = curr;
    
    while (pos>1)
    {
       prv= curr;
       curr =curr->next;
        pos--;
    }
    prv->next=ptr;
    ptr->next=curr;
}
void insertValue(){
    int value;
    printf("Enter the Value\n");
    scanf("%d",&value);
    if (head==NULL)
    {
        insertBeg();
        return;
    }

    if (head->data == value)
    {
        insertEnd();
        return;
    }
     struct node *ptr = createNode();
    struct node *curr = head->next;
    
    while (curr!=head && curr->data != value)
    {
       curr =curr->next;
    }
    ptr->next=curr->next;
    curr->next=ptr;
}
void display()
{
    if (head == NULL)
    {
        printf("List is empty.\n");
        return;
    }
    struct node *ptr = head->next;
   while (ptr!=head)
   {
     printf("%d - > ",ptr->data);
     ptr=ptr->next;
   
   }
printf("%d -> ",ptr->data);
 printf("NULL\n");
}
void dltFirst(){
    
    if (head == NULL)
    {
        printf("LinkedList is Empty Sorry For the inconviance\n");
        return;
    }
    idx--;
    struct node *ptr = head->next;
    if (head==head->next)
    {
        printf("Deleted Item is %d \n",ptr->data);
        head=NULL;
        free(ptr);
        return;
    }
    
    printf("Deleted Item is %d \n",ptr->data);
    head->next=ptr->next;
    free(ptr);
}
void dltLast(){
    
    if (head == NULL)
    {
        printf("LinkedList is Empty Sorry For the inconviance\n");
        return;
    }
    idx--;
    struct node *ptr = head->next;
    struct node *tem=ptr;
    if (head==head->next)
    {
        printf("Deleted Item is %d \n",ptr->data);
        head=NULL;
        free(ptr);
        return;
    }
    while (ptr!=head)
    {
        tem =ptr;
        ptr=ptr->next;
    }
    
    printf("Deleted Item is %d \n",ptr->data);
    tem->next=head->next;
    head =tem;
    free(ptr);
}
void dltAny(){
    
    int pos;
    printf("Enter the position\n");
    scanf("%d",&pos);
    if (pos>idx||pos<=0)
    {
        printf("Enter a valid position\n");
        return;
    }
    if (pos==1)
    {
       dltFirst();
       return;
    }
    if (pos==idx)
    {
        dltLast();
        return;
    }
    idx--;
     struct node *curr = head->next;
    struct node *prv = curr;
    while (pos>1)
    {
       prv= curr;
       curr =curr->next;
        pos--;
    }
      prv->next = curr->next;
      printf("Deleted Item is %d\n",curr->data);
      free(curr);
}

int main()
{
    int choice;

    while (1)
    {
        printf("\n1. Insert at the beginning, 2. Display, 3. Exit\n");
        scanf("%d", &choice);

        switch (choice)
        {
        case 1:
            insertBeg();
            break;

        case 2:
            display();
            break;

        case 3:
            insertEnd();
            break;
        case 4:
           dltFirst();
            break;
        case 5:
            dltLast();
            break;
        case 6:
            insertAny();
            break;
        case 9:
            insertValue();
            break;
        case 7:
            dltAny();
            break;
        case 8:
            exit(0);
            break;

        default:
            printf("Enter a valid choice.\n");
        }
    }

    return 0;
}

