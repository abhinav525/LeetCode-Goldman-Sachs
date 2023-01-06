class Solution {
public:
    int numberOfBoomerangs(vector<vector<int>>& points) {
        int n=points.size();
        int count =0;
        for(int i=0;i<n;i++){
            map<int,int>map;
            for(int j=0;j<n;j++){
                int distance=((points[i][0]-points[j][0])*(points[i][0]-points[j][0]))+((points[i][1]-points[j][1])*(points[i][1]-points[j][1]));
                map[distance]++;
            }
            for(auto i : map){
                if(i.second) count+=(i.second*(i.second-1));//nxn-1
            }

        }
        return count;
        
    }
};
