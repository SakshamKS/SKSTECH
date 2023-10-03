import javax.swing.tree.TreeNode;
public class SameTree {
        

    class TREE {


        public boolean Stre(TreeNode p, TreeNode q,int val,int left) {

            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }

            if (p.va != q.val) {
                return false;
            }
            return Stre(p.left)

        }
    }
}

