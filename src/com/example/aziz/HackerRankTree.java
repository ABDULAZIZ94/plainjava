package com.example.aziz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

class SumInLeavesVisitor extends TreeVis {
        int result = 0;
        public int getResult() {
            //implement this
            return result;
        }      

        public void visitNode(TreeNode node) {
            //implement this
            // Do nothing
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            result += leaf.getValue();
        }
    }


class ProductOfRedNodesVisitor extends TreeVis {
        long result = 1;
        static long modulo = (int)Math.pow(10,9) + 7;

        public int getResult() {
            //implement this
            return (int)result;
        }

        public void visitNode(TreeNode node) {
            //implement this
            if (node.getColor() == Color.RED)
                result = (result * node.getValue()) % modulo;
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if (leaf.getColor() == Color.RED)
                result = (result * leaf.getValue()) % modulo;
        }
}

class FancyVisitor extends TreeVis {
        int evenNodesSum = 0;
        int greenLeafSum = 0;

        public int getResult() {
            //implement this
            int result =  Math.abs(evenNodesSum - greenLeafSum);
            evenNodesSum= 0;
            greenLeafSum =0;
            return result;
        }

        public void visitNode(TreeNode node) {
            if (node.getDepth() % 2 == 0) {//even
                evenNodesSum += node.getValue();
            }
            //implement this
        }

        public void visitLeaf(TreeLeaf leaf) {
            //implement this
            if (leaf.getColor() == Color.GREEN) {
                greenLeafSum += leaf.getValue();
            }
        }
}

public class HackerRankTree {
  
    public static Tree solve() {
        Tree root = null;

            //read the tree from STDIN and return its root as a return value of this function
          
              try (BufferedReader inputBufferReader = new BufferedReader(new InputStreamReader(System.in));) {
                int numberOfNodes = Integer.parseInt(inputBufferReader.readLine());
                String[] values = inputBufferReader.readLine().split(" ");
                String[] colors = inputBufferReader.readLine().split(" ");

                Map<Integer, List<Integer>> nodeToChildren = new HashMap<>();
                Map<Integer, Integer> NoOfEdges = new HashMap<>();
                String edgeLine = null;
                while ((edgeLine = inputBufferReader.readLine()) != null) {
                    String[] nodes = edgeLine.split(" ");
                    int node1 = Integer.valueOf(nodes[0]) - 1;
                    int node2 = Integer.valueOf(nodes[1]) - 1;

                    if (nodeToChildren.get(node1) == null) {
                        nodeToChildren.put(node1, new LinkedList<Integer>());
                    }
                    if (nodeToChildren.get(node2) == null) {
                        nodeToChildren.put(node2, new LinkedList<Integer>());
                    }
                    nodeToChildren.get(node1).add(node2);
                    nodeToChildren.get(node2).add(node1);


                    NoOfEdges.put(node1, (NoOfEdges.get(node1) == null ? 0 : NoOfEdges.get(node1)) + 1);
                    NoOfEdges.put(node2, (NoOfEdges.get(node2) == null ? 0 : NoOfEdges.get(node2)) + 1);
                }

                Map<Integer, Tree> indexToNode = new HashMap<>();
                for (int nodeNo = 0; nodeNo < numberOfNodes; nodeNo++) {
                    int depth = getDepth(0, nodeNo, nodeToChildren, new HashSet<Integer>(),indexToNode);
                    Tree node = null;
                    if (NoOfEdges.get(nodeNo) == 1) {
                        node = new TreeLeaf(Integer.valueOf(values[nodeNo]), Color.values()[Integer.valueOf(colors[nodeNo])], depth);
                    } else {
                        node = new TreeNode(Integer.valueOf(values[nodeNo]), Color.values()[Integer.valueOf(colors[nodeNo])], depth);
                    }

                    indexToNode.put(nodeNo, node);
                }
                root = indexToNode.get(0);

                HashSet<Integer> alreadyVisited = new HashSet<>();
                alreadyVisited.add(0);
                addChildren(0, nodeToChildren, alreadyVisited, indexToNode);


            } catch (IOException e) {
                e.printStackTrace();
            }
            return root;
        
    }   
    
    private static void addChildren(int currentNode, Map<Integer, List<Integer>> nodeToChildren, Set<Integer> alreadyVisited, Map<Integer, Tree> indexToNode) {
            for (Integer childrenNo : nodeToChildren.get(currentNode)) {
                if (!alreadyVisited.contains(childrenNo)) {
                    ((TreeNode) indexToNode.get(currentNode)).addChild(indexToNode.get(childrenNo));
                    alreadyVisited.add(childrenNo);
                    addChildren(childrenNo, nodeToChildren, alreadyVisited, indexToNode);
                }
            }

        }

    private static int getDepth(int currentDepth, int currentNode, Map<Integer, List<Integer>> nodeToChildren, Set<Integer> alreadyVisited, Map<Integer, Tree> indexToNode) {
            if (currentNode == 0) {
                return currentDepth;
            }
            if(indexToNode.get(currentNode) != null){
                return currentDepth + indexToNode.get(currentNode).getDepth();
            }
            if (nodeToChildren.get(currentNode) != null && !alreadyVisited.contains(currentNode)) {
                alreadyVisited.add(currentNode);
                for (Integer integer : nodeToChildren.get(currentNode)) {
                    int depth = getDepth(currentDepth + 1, integer, nodeToChildren, alreadyVisited,indexToNode);
                    if (depth != -1)
                        return depth;
                }
            }
            return -1;
        }
}