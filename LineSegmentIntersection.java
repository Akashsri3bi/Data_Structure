public class LineSegmentIntersection {

      static int orientation(int[] p, int[] q, int[] r) {
            int val = (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
            if (val == 0) {
                  return 0; // Collinear
            }
            return (val > 0) ? 1 : 2; // clockwise and anticlockwise
      }

      static boolean onSegment(int[] p, int[] q, int[] r) {
            if (q[0] <= Math.max(p[0], r[0]) && q[0] >= Math.min(p[0], r[0]) &&
                        q[1] <= Math.max(p[1], r[1]) && q[1] >= Math.min(p[1], r[1])) {
                  return true;
            }
            return false;
      }

      int doIntersect(int p1[], int q1[], int p2[], int q2[]) {
            // code here
            int o1 = orientation(p1, q1, p2);
            int o2 = orientation(p1, q1, q2);
            int o3 = orientation(p2, q2, p1);
            int o4 = orientation(p2, q2, q1);

            if (o1 != o2 && o3 != o4) {
                  return 1;
            }

            if (o1 == 0 && onSegment(p1, p2, q1)) {
                  return 1;
            }

            if (o2 == 0 && onSegment(p1, q2, q1)) {
                  return 1;
            }

            if (o3 == 0 && onSegment(p2, p1, q2)) {
                  return 1;
            }

            if (o4 == 0 && onSegment(p2, q1, q2)) {
                  return 1;
            }
            return 0;
      }
      
}
