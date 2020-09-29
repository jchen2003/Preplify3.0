public void insert(int value){
  if(value < data){
    if(left == null){
      left == new Node(value);
    }
    else{
      left.insert(int value);
    }
  }
  else{
    if(right == null){
      right == new Node(value);
    }
    else{
      right.insert(int value);
    }
  }
}


public void preorder(){
  print root
  if(left.left != null || left.right != null){
    left.preorder();
  }
  else{
    print left
  }
  if(right.left != null || right.right != null){
    right.preorder();
  }
  else{
    print right
  }

}



public void inorder(TreeNode root){
  Stack < TreeNode > stack = new Stack < > ();//created a stack to backtrack up the tree
  TreeNode curr = root;
  while(curr != null || !stack.isEmpty()){ //while we don't finish the problem
    while(curr != null){ //while we aren't at the base
      stack.push(curr) //add current node to stack(saved for later)
      curr = curr.left;//move down to the left
    }
    curr = stack.pop();//prints base and then backtracks up the tree
    System.out.println(curr + "");//prints the node
    curr = curr.right;//goes down the parent node
  }
}
//The Concept of a while loop inside of a while loop essentially allows you to keep repeating
//the motion of drilling to the base, backtracking ONE step, and then going left down again, or right.
//Either you hit the bottom of the left, or you approach the bottom on the right ONE STEP at a time.
public void inorder(TreeNode root){
  Stack < TreeNode > stack = new Stack < > ();
  TreeNode curr = root;
  while(curr != null || !stack.isEmpty()){
    while(curr != null){
      stack.push(curr);
      curr = curr.left;
    }
      curr = stack.pop().right;
      if(curr.right == null) System.out.print(curr.data);
      else{
        curr = curr.right;
      }

  }



  }

}
left
right
finally the middle

public void preorder(TreeNode root){
  Stack < TreeNode > stack = new Stack <> ();
  TreeNode curr = root;
  while(curr != null || !stack.isEmpty()){
    while(curr != null){
      stack.push(curr);
      curr = curr.left;
    }
    curr = stack.pop();
    if(curr.right == null){ //If not a parent/middle node
      System.out.println(curr + " ");
    }






  }


}



public void inorder(TreeNode root){
  Stack < TreeNode > stack = new Stack < > ();//created a stack to backtrack up the tree
  TreeNode curr = root;
  while(curr != null || !stack.isEmpty()){ //while we don't finish the problem
    while(curr != null){ //while we aren't at the base
      stack.push(curr) //add current node to stack(saved for later)
      curr = curr.left;//move down to the left
    }
    curr = stack.pop();//prints base and then backtracks up the tree
    if(curr.right == null){
      System.out.print(curr);
    }
    else{
      stack.push(curr);
    }
    System.out.println(curr.data + "");//prints the node
    curr = curr.right;//goes down the parent node
  }
}
























public void postorder(TreeNode root){
  if(root == null) return;
  Stack <TreeNode> stack = new Stack<>();
  stack.push(root);

  Stack <TreeNode> stack2 = new Stack<>)();

  while(!stack.isEmpty()){
    TreeNode curr = stack.pop();
    stack2.push(curr);
    if(curr.left != null){
      stack.push(curr.left);
    }
    if(curr.right != null){
      stack.push(curr.right);
    }
  }
  while(!stack2.isEmpty){
    curr = stack2.pop();
    System.out.print(curr + "");
  }










}
